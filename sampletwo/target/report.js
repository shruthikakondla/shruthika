$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/npower/Smartmeters.feature");
formatter.feature({
  "line": 1,
  "name": "Smartmeter page",
  "description": "",
  "id": "smartmeter-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Smartmeter page",
  "description": "",
  "id": "smartmeter-page;smartmeter-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch npower site",
  "rows": [
    {
      "comments": [
        {
          "line": 5,
          "value": "#When user logsin"
        }
      ],
      "cells": [
        "\u003cusername\u003e"
      ],
      "line": 6
    },
    {
      "cells": [
        "\u003cpassword\u003e"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User navigates to smartmeter page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on Smart meter installation reviews",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on logout",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "smartmeter-page;smartmeter-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "smartmeter-page;smartmeter-page;;1"
    },
    {
      "cells": [
        "shiva.siri@gmail.com",
        "siri3043"
      ],
      "line": 14,
      "id": "smartmeter-page;smartmeter-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Smartmeter page",
  "description": "",
  "id": "smartmeter-page;smartmeter-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch npower site",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "comments": [
        {
          "line": 5,
          "value": "#When user logsin"
        }
      ],
      "cells": [
        "shiva.siri@gmail.com"
      ],
      "line": 6
    },
    {
      "cells": [
        "siri3043"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User navigates to smartmeter page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on Smart meter installation reviews",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def_npowerlogin.launch_npower_site()"
});
formatter.result({
  "duration": 158971000,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.cucumber.test.Step_Def_npowerlogin.launch_npower_site() in file:/C:/Users/shiva/eclipse-workspace/sampletwo/target/test-classes/\u0027 with pattern [^Launch npower site$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Table:[[shiva.siri@gmail.com], [siri3043]]]. \nStep: Given Launch npower site\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:383)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:344)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:125)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:417)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Step_Def_Smartmeters.user_navigates_to_smartmeter_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Def_Smartmeters.user_click_on_Smatmeter_reviews()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Def_npowerlogin.User_logout()"
});
formatter.result({
  "status": "skipped"
});
});