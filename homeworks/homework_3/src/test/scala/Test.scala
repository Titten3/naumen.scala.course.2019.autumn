import utest._

object Test extends TestSuite{

  val tests = Tests{
    'test_example - {
      val trueStr = "правда"
      assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
      assert(Exercises.prettyBooleanFormatter1(4) == "4")
      assert(Exercises.prettyBooleanFormatter1(65.56) == "65.56")
      assert(Exercises.prettyBooleanFormatter1(false) == "лож")
      assert(Exercises.prettyBooleanFormatter1(false) != trueStr)
    }

    'test_example1 - {
      val trueStr = "правда"
      assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
      assert(Exercises.prettyBooleanFormatter2(4) == "4")
      assert(Exercises.prettyBooleanFormatter2(65.56) == "65.56")
      assert(Exercises.prettyBooleanFormatter2(false) == "лож")
      assert(Exercises.prettyBooleanFormatter2(false) != trueStr)
    }

    'test_example2 - {
      val trueStr = "правда"
      assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
      assert(Exercises.prettyBooleanFormatter3(4) == "4")
      assert(Exercises.prettyBooleanFormatter3(65.56) == "65.56")
      assert(Exercises.prettyBooleanFormatter3(false) == "лож")
      assert(Exercises.prettyBooleanFormatter3(false) != trueStr)
    }

    'test_max1 - {
      assert(Exercises.max1(Seq(4,8,9,12,4)) == 12)
      assert(Exercises.max1(Seq(4,7,2)) == 7)
      assert(Exercises.max1(Seq(-4,-8,-9,-12)) == -4)
    }

    'test_max2 - {
      assert(Exercises.max2(Seq(4,8,9,12,4)) == Seq(12))
      assert(Exercises.max2(Seq()) == Seq())
      assert(Exercises.max2(Seq(4,7,2)) == Seq(7))
    }

    'test_max3 - {
      assert(Exercises.max3(Seq(4,8,9,12,4)) == Some(12))
      assert(Exercises.max3(Seq()) == None)
      assert(Exercises.max3(Seq(4,7,2)) == Some(7))
    }

    'test_sum1 - {
      assert(Exercises.sum1(10,10) == 20)
      assert(Exercises.sum1(-10,10) == 0)
      assert(Exercises.sum1(35,-10) == 25)
    }

    'test_sum2 - {
      assert(Exercises.sum2(10,10) == 20)
      assert(Exercises.sum2(-10,10) == 0)
      assert(Exercises.sum2(35,-10) == 25)
    }

    'test_sum3 - {
      assert(Exercises.sum3(10,10) == 20)
      assert(Exercises.sum3(-10,10) == 0)
      assert(Exercises.sum3(35,-10) == 25)
    }

  }
}
