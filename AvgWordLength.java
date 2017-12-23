import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class AvgWordLength extends Configured implements Tool {

  @Override
  public int run(String[] args) throws Exception {

    String input, output;
    if(args.length == 2) {
      input = args[0];
      output = args[1];
    } else {
      input = "your-input-dir";
      output = "your-output-dir";
    }

    JobConf conf = new JobConf(getConf(), AvgWordLength.class);
    conf.setJobName(this.getClass().getName());

    // TODO implement

    JobClient.runJob(conf);
    return 0;
  }

  public static void main(String[] args) throws Exception {
    int exitCode = ToolRunner.run(new AvgWordLength(), args);
    System.exit(exitCode);
  }
}
