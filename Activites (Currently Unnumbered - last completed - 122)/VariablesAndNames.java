public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven; // Creates the following integer variables: "cars, drivers, passengers, cars_not_driven, cars_driven".
        double space_in_a_car, carpool_capacity, average_passengers_per_car; // Creates the following floating point variables: "space_in_a_car, carpool_capacity, average_passengers_per_car".

        cars = 100; // Gives "cars" a value of 100. 
        space_in_a_car = 4.0; // Gives "space_in_a_car" a value of 4.0. 
        drivers = 30; // Gives "drivers" a value of 30.
        passengers = 90; // Gives "passengers" a value of 90.
        cars_not_driven = cars - drivers; // Gives "cars_not_driven" a value of 70 (100 - 30 = 70).
        cars_driven = drivers; // Gives "cars_driven" the value of 30 (same as the number of drivers). 
        carpool_capacity = cars_driven * space_in_a_car; // Gives "carpool_capacity" a value of 120.0 (30 * 4.0 is 120.0).
        average_passengers_per_car = passengers / cars_driven; // Gives "average_passengers_per_car" a value of 3 (90/30 is 3).


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}