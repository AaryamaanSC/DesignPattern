public class Main {
    public static void main(String args[]){
        //1) 2 abs class hoga iss case me button and checkbox
        //2) WinButton and WinCheckBox and macButton and macCheckBox

        //3) GUI factory banega 2 fun rhega usme createButton n create CheckBox
        //4) WindowGUI factory rhega and MacGUI factory rhega jisse call hoga specifuc button

        //5) app rhega isme constructor hoga necessay nhi h but mai kr rha hu

        GuiFactory macFactory = new MacGuiFactory();

        Application macApp = new Application(macFactory);
        macApp.renderUI();

    }
}
