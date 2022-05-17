$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("POC_Practices.feature");
formatter.feature({
  "line": 2,
  "name": "This feature is created for POC purpose",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Automation"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Validate if user able to login with Correct \u0027User\u0027 credentials",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TC1_User_CorrectCredentials"
    },
    {
      "line": 5,
      "name": "@TC01"
    },
    {
      "line": 5,
      "name": "@Regression"
    },
    {
      "line": 5,
      "name": "@E2E"
    },
    {
      "line": 5,
      "name": "@Postive"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "The \u0027User\u0027 launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The \u0027User\u0027 enters the username and password in the \"\u003cRowIndex\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The \u0027User\u0027 clicks on Log In Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The \u0027User\u0027 clicks order items",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\u0027User\u0027 Select lastest Order and view details",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "\u0027User\u0027 Get the information",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;",
  "rows": [
    {
      "cells": [
        "RowIndex"
      ],
      "line": 15,
      "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 16,
      "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1901051500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 16,
  "name": "Validate if user able to login with Correct \u0027User\u0027 credentials",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TC1_User_CorrectCredentials"
    },
    {
      "line": 1,
      "name": "@Automation"
    },
    {
      "line": 5,
      "name": "@E2E"
    },
    {
      "line": 5,
      "name": "@Regression"
    },
    {
      "line": 5,
      "name": "@Postive"
    },
    {
      "line": 5,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "The \u0027User\u0027 launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The \u0027User\u0027 enters the username and password in the \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The \u0027User\u0027 clicks on Log In Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The \u0027User\u0027 clicks order items",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\u0027User\u0027 Select lastest Order and view details",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "\u0027User\u0027 Get the information",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.theUserLaunchesTheApplication()"
});
formatter.result({
  "duration": 7213695800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 52
    }
  ],
  "location": "Login.theUserEntersTheUsernameAndPasswordInThe(int)"
});
formatter.result({
  "duration": 6301600,
  "status": "passed"
});
formatter.match({
  "location": "Login.theUserClicksOnLogInButton()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 7714571900,
  "status": "passed"
});
formatter.match({
  "location": "Login.theUserClicksOrderItems()"
});
formatter.write("Order items Clicked #:Returns");
formatter.result({
  "duration": 3720509800,
  "status": "passed"
});
formatter.match({
  "location": "Login.userSelectLastestOrderAndViewDetails()"
});
formatter.result({
  "duration": 3559853600,
  "status": "passed"
});
formatter.match({
  "location": "Login.userGetTheInformation()"
});
formatter.write("Order#:407-0596190-6479540");
formatter.write("Order#:Payment Method\nNet Banking: HDFC Bank\nBooking summary\nBase fare\n₹ 1,554.00\nBus operator GST\n₹ 77.70\nOrder Total\n₹ 1,631.70");
formatter.write("Order#:Bus Booking\nTicket ID: 6755TS4J\nPNR: VTA-AP-697772630305\nJourney completed\nHope you had a pleasant journey!\nChennaiTiruchengodu\nVetri Travels\nA/C Sleeper (2+1)\nBoarding Point:\n10:25 PMSun, 08 May\nPALLAVARAM (KPN BUNK)\nDuration\n6h 58m\nDrop Point:\n05:23 AMMon, 09 May\nMANIKAMPAMPALAYAM\nPALLAVARAM (KPN BUNK)\nNEAR BUS STOP\nTravellers (2) Seat number\nLoganathanMale, 28 Years (Primary Traveller) L8\nIniyanMale, 5 Years L9\nBook another bus\nDownload e-ticket\nCancellation \u0026 travel policy\nGet help\nTerms \u0026 Conditions");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 3940022900,
  "status": "passed"
});
formatter.after({
  "duration": 149500,
  "status": "passed"
});
formatter.after({
  "duration": 896445800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Validate if user able to login with Correct \u0027User\u0027 credentials",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@TC2_User_CorrectCredentials"
    },
    {
      "line": 18,
      "name": "@TC02"
    },
    {
      "line": 18,
      "name": "@Regression"
    },
    {
      "line": 18,
      "name": "@E2E"
    },
    {
      "line": 18,
      "name": "@Postive"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "The \u0027User\u0027 launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "The \u0027User\u0027 enters the username and password in the \"\u003cRowIndex\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "The \u0027User\u0027 clicks on Log In Button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "The \u0027User\u0027 clicks order items",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "\u0027User\u0027 Select lastest Order and view details",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "\u0027User\u0027 Get the information",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;",
  "rows": [
    {
      "cells": [
        "RowIndex"
      ],
      "line": 28,
      "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;1"
    },
    {
      "cells": [
        "2"
      ],
      "line": 29,
      "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4264600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 29,
  "name": "Validate if user able to login with Correct \u0027User\u0027 credentials",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@TC2_User_CorrectCredentials"
    },
    {
      "line": 1,
      "name": "@Automation"
    },
    {
      "line": 18,
      "name": "@E2E"
    },
    {
      "line": 18,
      "name": "@Regression"
    },
    {
      "line": 18,
      "name": "@Postive"
    },
    {
      "line": 18,
      "name": "@TC02"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "The \u0027User\u0027 launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "The \u0027User\u0027 enters the username and password in the \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "The \u0027User\u0027 clicks on Log In Button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "The \u0027User\u0027 clicks order items",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "\u0027User\u0027 Select lastest Order and view details",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "\u0027User\u0027 Get the information",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.theUserLaunchesTheApplication()"
});
formatter.result({
  "duration": 5488594500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 52
    }
  ],
  "location": "Login.theUserEntersTheUsernameAndPasswordInThe(int)"
});
formatter.result({
  "duration": 674700,
  "status": "passed"
});
formatter.match({
  "location": "Login.theUserClicksOnLogInButton()"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 7766532500,
  "status": "passed"
});
formatter.match({
  "location": "Login.theUserClicksOrderItems()"
});
formatter.write("Order items Clicked #:Returns");
formatter.result({
  "duration": 3572109200,
  "status": "passed"
});
formatter.match({
  "location": "Login.userSelectLastestOrderAndViewDetails()"
});
formatter.result({
  "duration": 3081117300,
  "status": "passed"
});
formatter.match({
  "location": "Login.userGetTheInformation()"
});
formatter.write("Order#:407-0596190-6479540");
formatter.write("Order#:Payment Method\nNet Banking: HDFC Bank\nBooking summary\nBase fare\n₹ 1,554.00\nBus operator GST\n₹ 77.70\nOrder Total\n₹ 1,631.70");
formatter.write("Order#:Bus Booking\nTicket ID: 6755TS4J\nPNR: VTA-AP-697772630305\nJourney completed\nHope you had a pleasant journey!\nChennaiTiruchengodu\nVetri Travels\nA/C Sleeper (2+1)\nBoarding Point:\n10:25 PMSun, 08 May\nPALLAVARAM (KPN BUNK)\nDuration\n6h 58m\nDrop Point:\n05:23 AMMon, 09 May\nMANIKAMPAMPALAYAM\nPALLAVARAM (KPN BUNK)\nNEAR BUS STOP\nTravellers (2) Seat number\nLoganathanMale, 28 Years (Primary Traveller) L8\nIniyanMale, 5 Years L9\nBook another bus\nDownload e-ticket\nCancellation \u0026 travel policy\nGet help\nTerms \u0026 Conditions");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "duration": 3551081000,
  "status": "passed"
});
formatter.after({
  "duration": 78600,
  "status": "passed"
});
formatter.after({
  "duration": 982474700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 33,
  "name": "Validate if user able to login with Correct \u0027User\u0027 credentials",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 32,
      "name": "@TC3_User_InCorrectCredentials"
    },
    {
      "line": 32,
      "name": "@TC03"
    },
    {
      "line": 32,
      "name": "@Smoke"
    },
    {
      "line": 32,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "The \u0027User\u0027 launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "The \u0027User\u0027 enters the username and password in the \"\u003cRowIndex\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "The \u0027User\u0027 clicks on Log In Button",
  "keyword": "And "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;",
  "rows": [
    {
      "cells": [
        "RowIndex"
      ],
      "line": 38,
      "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;1"
    },
    {
      "cells": [
        "3"
      ],
      "line": 39,
      "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6145700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 39,
  "name": "Validate if user able to login with Correct \u0027User\u0027 credentials",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 32,
      "name": "@Smoke"
    },
    {
      "line": 1,
      "name": "@Automation"
    },
    {
      "line": 32,
      "name": "@Negative"
    },
    {
      "line": 32,
      "name": "@TC3_User_InCorrectCredentials"
    },
    {
      "line": 32,
      "name": "@TC03"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "The \u0027User\u0027 launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "The \u0027User\u0027 enters the username and password in the \"3\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "The \u0027User\u0027 clicks on Log In Button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.theUserLaunchesTheApplication()"
});
formatter.result({
  "duration": 5021026300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 52
    }
  ],
  "location": "Login.theUserEntersTheUsernameAndPasswordInThe(int)"
});
formatter.result({
  "duration": 517300,
  "status": "passed"
});
formatter.match({
  "location": "Login.theUserClicksOnLogInButton()"
});
formatter.write("There was a problem\nWe cannot find an account with that email address");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "duration": 3894028700,
  "status": "passed"
});
formatter.after({
  "duration": 62200,
  "status": "passed"
});
formatter.after({
  "duration": 870748800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 43,
  "name": "Validate if user able to login with Correct \u0027User\u0027 credentials",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@TC4_User_InCorrectCredentials"
    },
    {
      "line": 42,
      "name": "@TC04"
    },
    {
      "line": 42,
      "name": "@Smoke"
    },
    {
      "line": 42,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "The \u0027User\u0027 launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "The \u0027User\u0027 enters the username and password in the \"\u003cRowIndex\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "The \u0027User\u0027 clicks on Log In Button",
  "keyword": "And "
});
formatter.examples({
  "line": 47,
  "name": "",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;",
  "rows": [
    {
      "cells": [
        "RowIndex"
      ],
      "line": 48,
      "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;1"
    },
    {
      "cells": [
        "4"
      ],
      "line": 49,
      "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3397900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 49,
  "name": "Validate if user able to login with Correct \u0027User\u0027 credentials",
  "description": "",
  "id": "this-feature-is-created-for-poc-purpose;validate-if-user-able-to-login-with-correct-\u0027user\u0027-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@Smoke"
    },
    {
      "line": 1,
      "name": "@Automation"
    },
    {
      "line": 42,
      "name": "@Negative"
    },
    {
      "line": 42,
      "name": "@TC4_User_InCorrectCredentials"
    },
    {
      "line": 42,
      "name": "@TC04"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "The \u0027User\u0027 launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "The \u0027User\u0027 enters the username and password in the \"4\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "The \u0027User\u0027 clicks on Log In Button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.theUserLaunchesTheApplication()"
});
formatter.result({
  "duration": 5668981900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 52
    }
  ],
  "location": "Login.theUserEntersTheUsernameAndPasswordInThe(int)"
});
formatter.result({
  "duration": 595900,
  "status": "passed"
});
formatter.match({
  "location": "Login.theUserClicksOnLogInButton()"
});
formatter.write("There was a problem\nWe cannot find an account with that email address");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "duration": 3265779900,
  "status": "passed"
});
formatter.after({
  "duration": 73500,
  "status": "passed"
});
formatter.after({
  "duration": 896624200,
  "status": "passed"
});
});