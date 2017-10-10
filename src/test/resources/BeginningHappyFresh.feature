Feature: Navigate into Web HappyFresh

  Scenario: Get Process Navigate HappyFresh for First Time

    Given prepara and navigate

    When Open Happyfresh for validate URL

    Then Get URL and equals with "https://www.happyfresh.id/"

    When Website HappyFresh Opened and Ready

    Then Searching FarmMarket on Carousel and Click

    When Website FarmMarket Has Been Opened

    Then Searching Button Login and Click

    When username and password show

    Then filled it


