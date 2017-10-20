$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BeginningHappyFresh.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate into Web HappyFresh",
  "description": "",
  "id": "navigate-into-web-happyfresh",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get Process Navigate HappyFresh for First Time",
  "description": "",
  "id": "navigate-into-web-happyfresh;get-process-navigate-happyfresh-for-first-time",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "prepara and navigate",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Open Happyfresh for validate URL",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Get URL and equals with \"https://www.happyfresh.id/\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Website HappyFresh Opened and Ready",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Searching FarmMarket on Carousel and Click",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Website FarmMarket Has Been Opened",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Searching Button Login and Click",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "username and password show",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "filled it",
  "keyword": "Then "
});
formatter.match({
  "location": "BeginningHappyFreshStep.prepara_and_navigate()"
});
formatter.result({
  "duration": 6050551783,
  "status": "passed"
});
formatter.match({
  "location": "BeginningHappyFreshStep.Website_HappyFresh_Has_Been_Opened()"
});
formatter.result({
  "duration": 63170112970,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.happyfresh.id/",
      "offset": 25
    }
  ],
  "location": "BeginningHappyFreshStep.Get_URL_and_equals_with(String)"
});
formatter.result({
  "duration": 40949286,
  "status": "passed"
});
formatter.match({
  "location": "BeginningHappyFreshStep.Website_HappyFresh_ready()"
});
formatter.result({
  "duration": 10814447365,
  "status": "passed"
});
formatter.match({
  "location": "BeginningHappyFreshStep.Navigate_FarmMarket_onCarousel()"
});
formatter.result({
  "duration": 35610827127,
  "status": "passed"
});
formatter.match({
  "location": "BeginningHappyFreshStep.Website_FarmMarket_Opened()"
});
formatter.result({
  "duration": 327448734,
  "status": "passed"
});
formatter.match({
  "location": "BeginningHappyFreshStep.Search_Button_Login()"
});
formatter.result({
  "duration": 303891524,
  "status": "passed"
});
formatter.match({
  "location": "BeginningHappyFreshStep.Prompt_Login_Visible()"
});
formatter.result({
  "duration": 96161661,
  "status": "passed"
});
formatter.match({
  "location": "BeginningHappyFreshStep.do_Login_FarmMarket()"
});
formatter.result({
  "duration": 1191965962,
  "status": "passed"
});
});