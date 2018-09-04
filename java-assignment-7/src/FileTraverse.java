import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class FileTraverse {

    public static void countOccurence(String fileName) throws IOException
    {
        FileReader fr = new FileReader(fileName);
        File result = new File("result.txt");
        FileWriter fw = new FileWriter(result);
        HashMap<Character,Integer> mapa = new HashMap<>();

        int i;
        while ((i=fr.read()) != -1)
        {
            if((char)i !=' ' && (char)i !='\n' && (char)i !='\t')
            {
                if (mapa.containsKey((char) i) == false)
                    mapa.put((char) i, 1);
                else
                    mapa.put((char) i, mapa.get((char) i) + 1);
            }
        }


        for(Character key : mapa.keySet())
        {
            fw.write(key);
            fw.write('\t');
            fw.write(String.valueOf(mapa.get(key)));
            fw.write('\n');
        }
        fw.close();
    }
}
