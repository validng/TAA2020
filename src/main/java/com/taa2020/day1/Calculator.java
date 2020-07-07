package main.java.com.taa2020.day1;

public class Calculator {

    public Integer add2(Integer a, Integer b) {
        return a + b;
    }

    public Integer addMore(Integer... nums) {
        Integer sum = 0;
        for (Integer n : nums) {
            sum += n;
        }
        return sum;
    }

    public Integer subtract(Integer... nums){
        Integer dif = nums[0];
        for (int i =1; i< nums.length;i++){
            dif -= nums[i];
        }
        return dif;
    }

    public Integer multiply(Integer... nums) {
        Integer result = 1;
        for (Integer n : nums) {
            result *= n;
        }
        return result;
    }
}

