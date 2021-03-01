package br.ce.yuster.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

// Para usar o JUnit
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/alugar_filmes.feature", // Qual feature será executada
		glue = "br.ce.yuster.steps",
		tags = {},
		plugin = "pretty", // Comentarios no terminal
		monochrome = true, // Terminal sem simbolos 
		snippets = SnippetType.CAMELCASE,
		dryRun = false, // Para validar os mapeamentos
		strict = false // false qr dizer que soh vai testar os que estao implementados 
		)
public class Runner {

}
