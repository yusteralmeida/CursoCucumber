import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

// Para usar o JUnit
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty", // comentarios no terminal
		monochrome = true, // terminal sem símbolos 
		snippets = SnippetType.CAMELCASE,
		dryRun = false, // Para validar os mapeamentos
		strict = false // false qr dizer que só vai testar os que estão implementados 
		)
public class Runner {

}
