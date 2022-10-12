package OnClass.c221013.practice2;

import OnClass.c221013.practice2.domain.Hospital;
import OnClass.c221013.practice2.parser.HospitalParser;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String address = "C:\\Users\\안락한곳\\Downloads\\서울시 병의원 위치 정보3.csv";

        HospitalParser HP = new HospitalParser();

        FileReadAndWrite fraw = new FileReadAndWrite(HP);
        List<Hospital> hospitalList = new ArrayList<>();
        hospitalList = fraw.readLine(address);

        fraw.write(hospitalList, "data.sql");
    }
}
