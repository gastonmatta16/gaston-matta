import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class RecentFileListTest {

    @Test
    void firstTimeRunningApp_listItsEmpty() {
        RecentFileList list = new RecentFileList();
        LinkedList<String> linkedList = list.getList();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    void openFile_firstElement_is_lastOpened(){
        RecentFileList list = new RecentFileList();
        list.openFile("file_1");
        list.openFile("file_2");
        list.openFile("file_3");
        list.openFile("file_4");
        LinkedList<String> linkedList = list.getList();
        assertEquals("file_4", linkedList.getFirst());
    }

    @Test
    void openFile_multipleTimes_noRepetitions() {
        RecentFileList list = new RecentFileList();
        list.openFile("file_1");
        list.openFile("file_1");
        list.openFile("file_1");
        LinkedList<String> linkedList = list.getList();
        assertEquals(1, linkedList.size());
    }

    @Test
    void list_Gets_Full_At_15_Elements() {
        RecentFileList list = new RecentFileList();
        list.openFile("file_1");
        list.openFile("file_2");
        list.openFile("file_3");
        list.openFile("file_4");
        list.openFile("file_5");
        list.openFile("file_6");
        list.openFile("file_7");
        list.openFile("file_8");
        list.openFile("file_9");
        list.openFile("file_10");
        list.openFile("file_11");
        list.openFile("file_12");
        list.openFile("file_13");
        list.openFile("file_14");
        list.openFile("file_15");
        list.openFile("file_16");
        LinkedList<String> linkedList = list.getList();
        assertFalse(linkedList.contains("file_1"));
    }



}