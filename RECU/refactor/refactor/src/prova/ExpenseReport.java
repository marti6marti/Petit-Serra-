package prova;

import java.util.Date;
import java.util.List;

public class ExpenseReport {
    public void printReport(List<Expense> expenses) {
        int total = 0;
        int mealExpenses = 0;

        data();

        for (Expense expense : expenses) {
           mealExpenses += esMenjar(expense,mealExpenses);
            siSuperaDatesPosarX(expense);
            total += expense.amount;
        }

       imprimirTotal(mealExpenses,total);
    }

    private void data (){
        System.out.println("Expenses " + new Date());
    }

    private int esMenjar (Expense expense,int mealExpenses){
        if (expense.type == ExpenseType.DINNER || expense.type == ExpenseType.BREAKFAST) {
            return expense.amount;
        }
        return 0;
    }

    private String tipusExpense (Expense expense){
        return switch (expense.type) {
            case DINNER -> "Dinner";
            case BREAKFAST -> "Breakfast";
            case CAR_RENTAL -> "Car Rental";
        };
    }

    private void siSuperaDatesPosarX (Expense expense){
        if (expense.type == ExpenseType.DINNER
                && expense.amount > 5000
                || expense.type == ExpenseType.BREAKFAST && expense.amount > 1000) {
            System.out.println(tipusExpense(expense) + "\t" + expense.amount + "\t" + "X");
        } else System.out.println(tipusExpense(expense) + "\t" + expense.amount);
    }
    private void imprimirTotal (int mealExpenses,int total){
        System.out.println("Meal expenses: " + mealExpenses + "\n" + "Total expenses: " + total );
    }

}
