package ru.mirea.inbo0219_task4;

public class Task4 {
    public int k, s,  count;

    public int Rec(int n){
        if (n==0){
            return s;
        }
        return (Rec(n / 10) + (n % 10));
    }

    public void Check(int s, int n){
        if (Rec(n) == s){
            this.count += 1;
        }
    }

    public Task4 (int k, int s){
        for (int i = (int) Math.pow(10, k-1); i < Math.pow(10, k); i++){
            Check(s, i);
        }
    }

    @Override
    public String toString(){
        return  this.count + " numbers.";
    }
}
