package com.glc;

import java.util.List;
import java.util.stream.Collectors;

public class ParseData{

    private List<Object> popText;
    private int totalPopulation;
    

    public ParseData(List<String> data) {
        popText = data.stream()
                .skip(1) 
                .map(line -> line.split(","))
                .map(parts -> parts[4])
                .collect(Collectors.toList());

        totalPopulation = sum(data);     
    }



    public List<Object> getPopData() {
        return popText;
    }

    @overload
    public int sum(List<String> popData) {
        return 0;
    }
  

    // calculate sum of pop
    public static int sum(List<Object> list){
        int totalPopulation = list.stream()
                    .skip(1)
                    .mapToInt(str -> {
                        try {
                            return Integer.parseInt(str.split(",")[4]);
                        } catch ( ArrayIndexOutOfBoundsException e) {
                            return 0; 
                        }
                    })
                    .sum();
                
        return totalPopulation;
    }
}
