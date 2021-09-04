package ningenme.net.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Execution(ExecutionMode.CONCURRENT)
public class Parallel2Test {

  @Test
  void test1() throws InterruptedException {
    Thread.sleep(1000 * 10);
  }

  @Test
  void test2() throws InterruptedException {
    Thread.sleep(1000 * 10);
  }

  @Test
  void test3() throws InterruptedException {
    Thread.sleep(1000 * 10);
  }

  @Test
  void test4() throws InterruptedException {
    Thread.sleep(1000 * 10);
  }

}
