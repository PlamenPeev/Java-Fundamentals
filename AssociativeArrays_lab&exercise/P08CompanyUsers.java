package exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        Map<String, List<String>> companyBook = new TreeMap<>();

        while (!data.equals("End")) {
            String name = data.split(" -> ")[0];
            String id = data.split(" -> ")[1];


            if (!companyBook.containsKey(name)) {
                companyBook.put(name, new ArrayList<>());
                companyBook.get(name).add(id);
            }else{
                if (!companyBook.get(name).contains(id)) {
                    companyBook.get(name).add(id);
                }
            }

            data = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyBook.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String id : entry.getValue()) {
                System.out.printf("-- %s%n", id);
            }

        }
    }
}
