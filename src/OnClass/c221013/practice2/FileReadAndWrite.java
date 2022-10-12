package OnClass.c221013.practice2;

import OnClass.c221013.practice2.domain.Hospital;
import OnClass.c221013.practice2.parser.Parser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadAndWrite<T> {

    Parser<T> parser;

    public FileReadAndWrite(Parser<T> parser) {
        this.parser = parser;
    }

    public List<T> readLine(String filename) {
        File file = new File(filename);
        List<T> lists = new ArrayList<T>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";

            while ((line = br.readLine()) != null) {
                line = br.readLine();
                lists.add(parser.parse(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lists;
    }

    public void write(List<Hospital> lists, String filename ) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for (Hospital hospital : lists) {
                writer.write("("+"'"+hospital.getId()+"'"+","
                        +"'"+hospital.getAddress()+"'"+","
                        +"'"+hospital.getDistrict()+"'"+","
                        +"'"+hospital.getCode()+"'"+","
                        +hospital.getEmergency()+","
                        +"'"+hospital.getName()+"'"+"),\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
