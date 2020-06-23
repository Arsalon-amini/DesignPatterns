package com.codeWithArsalon.Mediator;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox(){
        articlesListBox.addEventHandler(this::articleSelected); //lambda (Observer) when @handle() triggers implements articleSelected
        titleTextBox.addEventHandler(this::titleChanged); //when @handle() triggers implements titleChanged ()
    }

    private void titleChanged(){
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article 1"); //trigger handle method () -> articleSelected()
        titleTextBox.setContent(" ");
        System.out.println("Textbox" + titleTextBox.getContent());
        System.out.println("Button:" + saveButton.isEnabled());
    }
}
