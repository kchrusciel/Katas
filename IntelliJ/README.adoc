== Keymap Dojo

* Create new project (Maven will be ok)
* Right now you can use only keyboard
* Create new class "Dojo" with psvm
* add sout with "message" message (sout)
* duplicate five times line created before
* change last "message" to "last"
* move last line to the top
* extract "message" to const
* move cursor on the begging and end
* move cursor between whitespaces
* extract one of "meesage" line to other method
* create test for this class
* show all tests for this class
* copy and paste code below to DojoTest class:

[source, java]
----
@Test
public void dojoTest() {
    assertEquals("First", dojoMethod(1));
    assertEquals("Second", dojoMethod(2));
    assertEquals("Other", dojoMethod(3));
}

private String dojoMethod(int value) {
    if (value == 1) {
        return "First";
    } else if (value == 2) {
        return "Second";
    }
    return "Other";
}
----

* run tests for a first time
* run tests for a second time
* add breakpoint on first and second assertion and line with "Other"
* go to assertEquals definition
* on assertEquals definition show usages
* close assert class editor
* run tests on debug
* go inside
* step over
* switch to other breakpoint
* evaluate "dojoMethod(2)"
* switch to other breakpoint
* increase font size
* find "message" in Dojo class file
* find "Second" in path
* show Dojo class hierachy
* copy and paste code below to Dojo class:

[source, java]
----
private String dojoSurround(int value) {
    return "Message";
}
----

* surround return statement with if/else
* go to line number 20 in DojoTest class
* make the shrink selection for a few times
* back to previous file cursor position

* go to settings
* change theme
* go to project settings and change project name
* enter presentation mode
* exit presentation mode
* open project view
* open structure view
* make full screen on active editor
* switch recent files
* switch card tabs
* go to settings
* change theme once again