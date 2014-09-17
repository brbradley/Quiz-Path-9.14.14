/*
 * Quiz Path Project
 */
package quiz.path.pkg9.pkg14.pkg14;

import java.util.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuizPath91414 {

    private ArrayList<Question> allQuestions = new ArrayList<Question>();
    
    public void readFromFile()
    {
        BufferedReader reader=null;
        try {
            File file = new File("Questions.txt");
            reader = new BufferedReader(new FileReader(file));
            
            String line;
            while((line=reader.readLine()) != null)
            {
                //System.out.println(line);
                Question q = new Question();
                q.setQuestion(line);
                line = reader.readLine();
                q.setAnswer(line);
                line = reader.readLine();
                q.setKeyWord(line);
                line = reader.readLine();
                q.setExplination(line);
                line = reader.readLine();
                q.setSubject(line);
                line = reader.readLine();
                allQuestions.add(q);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
     }

    
    public void run()
    {
        readFromFile();
        for(int i=0;i<allQuestions.size();i++)
        {
            System.out.println(allQuestions.get(i));
        }
    }
    
    public static void main(String[] args) {
        QuizPath91414 q = new QuizPath91414();
        q.run();
    }
}
