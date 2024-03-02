package jpass.ui;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StatusPanelTest {
    private StatusPanel statusPanel;

    @Before
    public void setUp() {
        statusPanel = new StatusPanel();
    }

    @Test
    public void testSetProcessing() {
        statusPanel.setProcessing(true);
        Assert.assertTrue("Visible while processing", statusPanel.progressBar.isVisible());
        Assert.assertTrue("Indeterminate while processing", statusPanel.progressBar.isIndeterminate());
        Assert.assertEquals("'Processing...' while processing", "Processing...", statusPanel.getText());

        statusPanel.setProcessing(false);
        Assert.assertFalse("Not visible while not processing", statusPanel.progressBar.isVisible());
        Assert.assertFalse("Not indeterminate while not processing", statusPanel.progressBar.isIndeterminate());
        Assert.assertEquals("Empty while not processing", " ", statusPanel.getText());
    }
}
