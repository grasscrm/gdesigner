package tests;
import org.junit.Test;

import util.OryxSeleneseTestCase;

public class StepThroughTest extends OryxSeleneseTestCase {
	public void setUp() throws Exception {
		super.setUp();
	}
	@Test public void testStepThrough() throws Exception {
		/*selenium.open("/oryx/editor.xhtml");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=#erdf_import_button button")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("css=#erdf_import_button button");
		selenium.type("ext-comp-1074", "<?xml version=\"1.0\" encoding=\"utf-8\"?><html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:b3mn=\"http://b3mn.org/2007/b3mn\" xmlns:ext=\"http://b3mn.org/2007/ext\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:atom=\"http://b3mn.org/2007/atom+xhtml\"><head profile=\"http://purl.org/NET/erdf/profile\"><link rel=\"schema.dc\" href=\"http://purl.org/dc/elements/1.1/\" /><link rel=\"schema.dcTerms\" href=\"http://purl.org/dc/terms/ \" /><link rel=\"schema.b3mn\" href=\"http://b3mn.org\" /><link rel=\"schema.oryx\" href=\"http://oryx-editor.org/\" /><link rel=\"schema.raziel\" href=\"http://raziel.org/\" /><base href=\"http://localhost:8080/oryx/editor.xhtml\" /></head><body><div id=\"oryx-canvas123\" class=\"-oryx-canvas\"><span class=\"oryx-type\">http://b3mn.org/stencilset/bpmn1.1#BPMNDiagram</span><span class=\"oryx-id\"></span><span class=\"oryx-name\"></span><span class=\"oryx-version\"></span><span class=\"oryx-author\"></span><span class=\"oryx-language\">English</span><span class=\"oryx-expressionlanguage\"></span><span class=\"oryx-querylanguage\"></span><span class=\"oryx-creationdate\"></span><span class=\"oryx-modificationdate\"></span><span class=\"oryx-pools\"></span><span class=\"oryx-documentation\"></span><span class=\"oryx-mode\">writable</span><span class=\"oryx-mode\">fullscreen</span><a rel=\"oryx-stencilset\" href=\"./stencilsets/bpmn1.1/bpmn1.1.json\"/><a rel=\"oryx-render\" href=\"#oryx_697A89B8-5C42-42E7-B894-BF2B5F744D5D\"/><a rel=\"oryx-render\" href=\"#oryx_13B7F26D-9277-4412-B7D4-6CDC7757E1A1\"/><a rel=\"oryx-render\" href=\"#oryx_004CF101-88AD-44C5-9962-F25828D74241\"/></div><div id=\"oryx_697A89B8-5C42-42E7-B894-BF2B5F744D5D\"><span class=\"oryx-type\">http://b3mn.org/stencilset/bpmn1.1#Task</span><span class=\"oryx-id\"></span><span class=\"oryx-categories\"></span><span class=\"oryx-documentation\"></span><span class=\"oryx-name\"></span><span class=\"oryx-assignments\"></span><span class=\"oryx-pool\"></span><span class=\"oryx-lanes\"></span><span class=\"oryx-activitytype\">Task</span><span class=\"oryx-status\">None</span><span class=\"oryx-performers\"></span><span class=\"oryx-properties\"></span><span class=\"oryx-inputsets\"></span><span class=\"oryx-inputs\"></span><span class=\"oryx-outputsets\"></span><span class=\"oryx-outputs\"></span><span class=\"oryx-iorules\"></span><span class=\"oryx-startquantity\">1</span><span class=\"oryx-completionquantity\">1</span><span class=\"oryx-looptype\">None</span><span class=\"oryx-loopcondition\"></span><span class=\"oryx-loopcounter\">1</span><span class=\"oryx-loopmaximum\">1</span><span class=\"oryx-testtime\">After</span><span class=\"oryx-mi_condition\"></span><span class=\"oryx-mi_ordering\">Sequential</span><span class=\"oryx-mi_flowcondition\">All</span><span class=\"oryx-complexmi_condition\"></span><span class=\"oryx-iscompensation\"></span><span class=\"oryx-tasktype\">None</span><span class=\"oryx-inmessage\"></span><span class=\"oryx-outmessage\"></span><span class=\"oryx-implementation\">Webservice</span><span class=\"oryx-messageref\"></span><span class=\"oryx-instantiate\"></span><span class=\"oryx-script\"></span><span class=\"oryx-taskref\"></span><span class=\"oryx-bgcolor\">#ffffcc</span><span class=\"oryx-bounds\">55,120,155,200</span><a rel=\"raziel-outgoing\" href=\"#oryx_004CF101-88AD-44C5-9962-F25828D74241\"/><a rel=\"raziel-parent\" href=\"#oryx-canvas123\"/></div><div id=\"oryx_13B7F26D-9277-4412-B7D4-6CDC7757E1A1\"><span class=\"oryx-type\">http://b3mn.org/stencilset/bpmn1.1#Task</span><span class=\"oryx-id\"></span><span class=\"oryx-categories\"></span><span class=\"oryx-documentation\"></span><span class=\"oryx-name\"></span><span class=\"oryx-assignments\"></span><span class=\"oryx-pool\"></span><span class=\"oryx-lanes\"></span><span class=\"oryx-activitytype\">Task</span><span class=\"oryx-status\">None</span><span class=\"oryx-performers\"></span><span class=\"oryx-properties\"></span><span class=\"oryx-inputsets\"></span><span class=\"oryx-inputs\"></span><span class=\"oryx-outputsets\"></span><span class=\"oryx-outputs\"></span><span class=\"oryx-iorules\"></span><span class=\"oryx-startquantity\">1</span><span class=\"oryx-completionquantity\">1</span><span class=\"oryx-looptype\">None</span><span class=\"oryx-loopcondition\"></span><span class=\"oryx-loopcounter\">1</span><span class=\"oryx-loopmaximum\">1</span><span class=\"oryx-testtime\">After</span><span class=\"oryx-mi_condition\"></span><span class=\"oryx-mi_ordering\">Sequential</span><span class=\"oryx-mi_flowcondition\">All</span><span class=\"oryx-complexmi_condition\"></span><span class=\"oryx-iscompensation\"></span><span class=\"oryx-tasktype\">None</span><span class=\"oryx-inmessage\"></span><span class=\"oryx-outmessage\"></span><span class=\"oryx-implementation\">Webservice</span><span class=\"oryx-messageref\"></span><span class=\"oryx-instantiate\"></span><span class=\"oryx-script\"></span><span class=\"oryx-taskref\"></span><span class=\"oryx-bgcolor\">#ffffcc</span><span class=\"oryx-bounds\">230,120,330,200</span><a rel=\"raziel-parent\" href=\"#oryx-canvas123\"/></div><div id=\"oryx_004CF101-88AD-44C5-9962-F25828D74241\"><span class=\"oryx-type\">http://b3mn.org/stencilset/bpmn1.1#SequenceFlow</span><span class=\"oryx-id\"></span><span class=\"oryx-categories\"></span><span class=\"oryx-documentation\"></span><span class=\"oryx-name\"></span><span class=\"oryx-sourceref\"></span><span class=\"oryx-targetref\"></span><span class=\"oryx-conditiontype\">None</span><span class=\"oryx-conditionexpression\"></span><span class=\"oryx-quantity\">1</span><span class=\"oryx-showdiamondmarker\">false</span><span class=\"oryx-bounds\">155.21875,160,229.78125,160</span><a rel=\"raziel-outgoing\" href=\"#oryx_13B7F26D-9277-4412-B7D4-6CDC7757E1A1\"/><a rel=\"raziel-parent\" href=\"#oryx-canvas123\"/><span class=\"oryx-dockers\">50 40 50 40  # </span><a rel=\"raziel-target\" href=\"#oryx_13B7F26D-9277-4412-B7D4-6CDC7757E1A1\"/></div></body></html>");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=#erdf_import_dialog_button button")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("css=#erdf_import_dialog_button button");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (!selenium.isElementPresent("css=.LoadingIndicator")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("css=#stepthrough_button button");
		selenium.waitForPageToLoad("30000000000");
		selenium.runScript("var shape = ORYX.EditorInstance.getCanvas().getChildShapes()[0]; ORYX.EditorInstance.handleEvents({type: 'mouseup', clientX: 0, clientY: 0}, shape);");
		*/
	}
}