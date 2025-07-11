using System;
using System.Collections.Generic;

namespace AllergiesCsharpImplementation
{
    public enum Allergen
    {
        Eggs = 1 << 0,
        Peanuts = 1 << 1,
        Shellfish = 1 << 2,
        Strawberries = 1 << 3,
        Tomatoes = 1 << 4,
        Chocolate = 1 << 5,
        Pollen = 1 << 6,
        Cats = 1 << 7
    }

    public class Allergies
    {
        public readonly int score;

        public static Allergies CreateAllergy(Allergen[] allergens)
        {
            int totalScore = 0;
            // scenario 3
            if (allergens == null)
            {
                return new Allergies(0);
            }
            else
            {
                foreach (Allergen allergen in allergens)
                {
                    totalScore |= (int)allergen;
                }
            }
            return new Allergies(totalScore);
        }

        public Allergies(int score) => this.score = score;

        public bool IsAllergicTo(Allergen allergen)
        {
            // scenario 1
            if (score == 0)
            {
                return false;
            }
            else
            {
                return (score & (int)allergen) != 0;
            }
        }

        public Allergen[] List()
        {
            List<Allergen> result = new List<Allergen>();

            foreach (Allergen allergen in Enum.GetValues(typeof(Allergen)))
            {
                if ((score & (int)allergen) != 0)
                {
                    result.Add(allergen);
                }
            }
            return result.ToArray();
        }
    }
}