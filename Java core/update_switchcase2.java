class update_switchcase2 {
    public static void main(String args[])
    {
        String day= "Monday";
        String result="";
        switch(day)
        {
           case "Saturday","Sunday" -> result= "6am";
           case "Monday" -> result= "8am";
            default -> result = "7am";
        }

        System.out.println(result);
    }
}
