$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/DirectLineLogin.feature");
formatter.feature({
  "line": 1,
  "name": "DirectLine Login Page",
  "description": "",
  "id": "directline-login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "DirectLine LoginPage",
  "description": "",
  "id": "directline-login-page;directline-loginpage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I Launch DirectLine Site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Enter username and password",
  "rows": [
    {
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
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify whether login is successful",
  "rows": [
    {
      "cells": [
        "\u003cText\u003e"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "directline-login-page;directline-loginpage;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Text"
      ],
      "line": 16,
      "id": "directline-login-page;directline-loginpage;;1"
    },
    {
      "cells": [
        "qa@greenflag.com",
        "Password1",
        "Successfully logged in!"
      ],
      "line": 17,
      "id": "directline-login-page;directline-loginpage;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "DirectLine LoginPage",
  "description": "",
  "id": "directline-login-page;directline-loginpage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I Launch DirectLine Site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Enter username and password",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "qa@greenflag.com"
      ],
      "line": 6
    },
    {
      "cells": [
        "Password1"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify whether login is successful",
  "matchedColumns": [
    2
  ],
  "rows": [
    {
      "cells": [
        "Successfully logged in!"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Def_DirectLineLogin.ILaunchDirectLineSite()"
});
formatter.result({
  "duration": 4632733301,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def_DirectLineLogin.IEnterUsernameandPassword(DataTable)"
});
formatter.result({
  "duration": 388162400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def_DirectLineLogin.i_click_on_Login()"
});
formatter.result({
  "duration": 77791300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def_DirectLineLogin.i_verify_whether_login_is_successful(DataTable)"
});
formatter.result({
  "duration": 651508200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def_DirectLineLogin.close_the_browser()"
});
formatter.result({
  "duration": 168969600,
  "status": "passed"
});
});