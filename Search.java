class Search 
{
    public static void main(String[] args) 
    {
        // Example usage
        String inputString = "java is object oritated lang.Java is used widely in software development.";
        String searchWord = "Java";

        int count = searchWordFunction(inputString, searchWord);
        System.out.println("The word \"" + searchWord + "\" occurs " + count + " times in the given string.");
    }

    public static int searchWordFunction(String inputString, String searchWord) 
    {
        int count = 0;
        String[] words = inputString.split("\\s+"); // Split the input string into words

        for (String word : words) 
         {
            if (word.equalsIgnoreCase(searchWord)) 
            {
                count++;
            }
        }

        return count;
    }
}
