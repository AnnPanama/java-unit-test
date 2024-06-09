import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
    public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
        this.result = result;
  }

    @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
		 {18,true},
        {20,true},
        {17,false},
        {19,true}
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    boolean isAdult= program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Проверка провалена",result,isAdult);
	}
}
