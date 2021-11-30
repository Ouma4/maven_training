package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    //For the add eq
    @test
    void Four_Plus_Four_Is_Eight(){
       int x = 4;
       int y = 4;
       int rest = Sample.op(ADD,x,y);
         Assertions.assertThat(rest).as("Result of 4+4").isEqualTo(8);
    }

    //For the multiplication eq
    @test
    void Two_Mult_Two_Is_Four(){
        int x = 4;
        int y = 4;
        int rest = Sample.op(MULT,x,y);
        Assertions.assertThat(rest).as("Result of 2*2").isEqualTo(4);
    }

    //For the Fact we have an exception and a normal test
    @test
    void For_A_Negative_variable(){
        int n = -2;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Sample.fact(n));
    }

    @test
    void Two_Mult_Two_Is_Four(){
        int n = 3;
        int rest = Sample.fact(n);
        Assertions.assertThat(rest).as("Result of fact 2").isEqualTo(6);
    }


}
