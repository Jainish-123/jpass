package jpass.ui;

import jpass.ui.SearchPanel;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchPanelTest {
    private SearchPanel searchPanel;

    @Before
    public void setUp() {
        searchPanel = new SearchPanel(null);
    }

    @Test
    public void testGetSearchCriteria() {
        searchPanel.setVisible(true);
        searchPanel.setEnabled(true);
        searchPanel.setCriteriaFieldText(searchPanel, "test");
        assertEquals("test", searchPanel.getSearchCriteria());
    }
}
