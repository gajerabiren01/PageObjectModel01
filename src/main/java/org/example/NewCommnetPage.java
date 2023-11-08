package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewCommnetPage extends Utils{



    public void addCommentOnNewRelease()
    {
        waitForClickable(By.xpath("//button[@name='add-comment']"),10);
        //fill title section
        typeText(By.xpath("//input[@id='AddNewComment_CommentTitle']"),"Test01");
        //fill comment section
        typeText(By.xpath("//textarea[@id='AddNewComment_CommentText']"),"Test working");
        //click on new comment button
        clickOnElement(By.xpath("//button[@name='add-comment']"));
        //get message of adding new comment
         String actualCommentMessage =getTextFromElement(By.className("result"));
         //expected message of comment
         String expectedCommentMessage = "News comment is successfully added.";
         //verify that comment has been added
        Assert.assertEquals(actualCommentMessage,expectedCommentMessage,"Wrong message");
        //comment section size
//        getArrayList(By.xpath("//div[@class='comment-content']"));
        //check if array list contains last comment at the end of an array
        verifyCommentAddedAtLastPosition(By.xpath("//div[@class='comment-content']"));

    }


}
