package leetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWithCandies {

    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        KidsWithCandies driver = new KidsWithCandies();

        List<Boolean> booleans = driver.kidsWithCandies2(candies, extraCandies);

        System.out.println(booleans);


    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        final int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= max).collect(Collectors.toList());
    }

    public List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        int max = 0;
        if (candies.length == 0) {
            return Collections.emptyList();
        }
        for (int i : candies) {
            if (i>max) {
                max = i;
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int i : candies) {

                result.add(i + extraCandies >= max);

        }
        return result;
    }

}
