import java.util.LinkedList;

public class RecentFileList {

    private LinkedList<String> recentFilesList;
    private int size = 15;

    public RecentFileList() {
            recentFilesList = new LinkedList<String>();
    }

    public LinkedList<String> getList(){
        return recentFilesList;
    }

    public void openFile(String fileName) {
        if(recentFilesList.contains(fileName)) {
            recentFilesList.remove(fileName);
            recentFilesList.addFirst(fileName);
        }
        else {
            if (listIsFull()) {
                recentFilesList.removeLast();
                recentFilesList.addFirst(fileName);
            }
            else {
                recentFilesList.addFirst(fileName);
            }
        }
    }

    private boolean listIsFull() {
        if (recentFilesList.size()==size)
            return true;
        else return false;
    }


}
