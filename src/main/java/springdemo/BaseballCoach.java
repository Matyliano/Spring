package springdemo;

public class BaseballCoach implements Coach {
    //define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach( FortuneService fortuneService ) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    //dependency = helper. uzywamy jej tu
    public String getDailyFortune() {

        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }


}
