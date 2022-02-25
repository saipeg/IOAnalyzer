import org.junit.Test;
import ru.edu.lecture3.FileAnalyser;
import ru.edu.lecture3.FileAnalyserImpl;

import java.util.Set;

public class FileAnalyserTests {

    private FileAnalyser fileAnalyser = new FileAnalyserImpl("fileTest.txt");

    @Test
    public void fileAnalyserTest() {

        //fileAnalyser.getRowsCount();
        //fileAnalyser.getLettersCount();
        //System.out.println(fileAnalyser.getSymbolsStatistics())

        System.out.println(fileAnalyser.getTopNPopularSymbols(2));
    }
}