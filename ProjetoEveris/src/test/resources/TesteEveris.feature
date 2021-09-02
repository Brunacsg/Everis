
@tag
Feature: Validar Fluxo completo de compra
  @tag1
  Scenario: Validar compra
    Given que eu esteja no site "http://automationpractice.com/index.php"
    When eu clicar no botao de login
    And pesquisar o produto
    And selecionar o produto pesquisado
    Then conclua a compra com sucesso
    

