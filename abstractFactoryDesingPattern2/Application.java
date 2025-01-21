public class Application {
    private Button button;
    private CheckBox checkBox;

    Application(GuiFactory guiFactory){
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    void renderUI(){
        button.render();
        checkBox.render();
    }
}
