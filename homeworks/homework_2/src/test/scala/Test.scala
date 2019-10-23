import Exercises.Vector2D
import utest._

object Test extends TestSuite{

  val tests = Tests{
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }

    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1,5) == 8)
      assert(Exercises.sumOfDivBy3Or5(1,5) != 7)
      assert(Exercises.sumOfDivBy3Or5(1,2) == 0)
      assert(Exercises.sumOfDivBy3Or5(20,30) == 147)
    }

    'Test_primeFactor - {
      assert(Exercises.primeFactor(5) == Seq(5))
      assert(Exercises.primeFactor(100) == Seq(2,5))
      assert(Exercises.primeFactor(13452) == Seq(2,3,19,59))
    }

    'Test_sumScalars - {
      val vector1 = new Vector2D(2,0)
      val vector2 = new Vector2D(0,2)
      val vector3 = new Vector2D(4,2)
      val vector4 = new Vector2D(1,2)
      val vector5 = new Vector2D(3,2)
      val vector6 = new Vector2D(0,0)
      assert(Exercises.sumScalars(vector1 , vector2, vector4, vector5) == 7)
      assert(Exercises.sumScalars(vector1 , vector2, vector3, vector5) == 16)
      assert(Exercises.sumScalars(vector1 , vector2, vector3, vector6) == 0)
      assert(Exercises.sumScalars(vector3 , vector2, vector5, vector4) == 11)
    }

    'Test_sumCosines - {
      val vector1 = new Vector2D(2,0)
      val vector2 = new Vector2D(0,2)
      val vector3 = new Vector2D(4,2)
      val vector4 = new Vector2D(1,2)
      val vector5 = new Vector2D(3,2)
      assert(Exercises.sumCosines(vector1 , vector2, vector4, vector5) == 0.8682431421244592)
      assert(Exercises.sumCosines(vector1 , vector2, vector3, vector5) == 0.9922778767136676)
      assert(Exercises.sumCosines(vector3 , vector2, vector5, vector4) == 1.315456737624417)
    }

    'Test_sortByHeavyweight - {

      assert(Exercises.sortByHeavyweight(Map(
        "Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874),
        "Gold" ->     (2,   19.32),  "Potassium" -> (14,  0.862), "Calcium" ->   (8,   1.55),  "Cobalt" ->    (4,   8.90)
      ))==Seq("Aluminum", "Gold", "Tungsten", "Iron", "Cobalt", "Calcium", "Potassium", "Graphite"))
      assert(Exercises.sortByHeavyweight(Map(
        "Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874),
        "Lithium" ->  (12,  0.534),  "Magnesium" -> (10,  1.738), "Copper" ->    (3,   8.96),  "Sodium" ->    (5,   0.971),
        "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Silver" ->    (4,   4.505), "Uranium" ->   (2,   19.04),
        "Chrome" ->   (3,   7.18),   "Cesium" ->    (7,   1.873), "Zirconium" -> (3,   6.45)
      ))==Seq("Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Cesium", "Lithium", "Magnesium", "Graphite"))
      assert(Exercises.sortByHeavyweight(Map(
        "Gold" ->     (2,   19.32),  "Potassium" -> (14,  0.862), "Calcium" ->   (8,   1.55),  "Cobalt" ->    (4,   8.90),
        "Lithium" ->  (12,  0.534),  "Magnesium" -> (10,  1.738), "Copper" ->    (3,   8.96),  "Sodium" ->    (5,   0.971),
        "Nickel" ->   (2,   8.91),   "Tin" ->       (1,   7.29),  "Platinum" ->  (1,   21.45), "Plutonium" -> (3,   19.25),
        "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Silver" ->    (4,   4.505), "Uranium" ->   (2,   19.04)
      ))==Seq("Tin", "Platinum", "Nickel", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Copper", "Silver", "Plutonium", "Cobalt", "Calcium", "Lithium", "Magnesium", "Potassium"))
    }
  }
}

