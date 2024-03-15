using AllergiesCsharpImplementation;

class Program
{
    static void Main()
    {
        // Example usage
        Allergen[] allergies = { Allergen.Eggs, Allergen.Tomatoes }; // Example allergens
        Allergies personAllergies = Allergies.CreateAllergy(allergies);

        Console.WriteLine(personAllergies.IsAllergicTo(Allergen.Eggs)); // Should return true
        Console.WriteLine(personAllergies.IsAllergicTo(Allergen.Tomatoes)); // Should return true
        Console.WriteLine(personAllergies.IsAllergicTo(Allergen.Peanuts)); // Should return false
    }
}