import java.io.IOException;
import java.util.Set;

/**
 * Interface que define o comportamento esperado de um Parser.
 * Um Parser deve ser capaz de processar um arquivo contendo o log da 
 * tentativa de execução de uma tarefa do usuário na grade e extrair
 * dele o conjunto de serviços de grade envolvidos.
 * @author Alexandre Nóbrega Duarte - alexandrend@gmail.com
 */
 public interface Parser {

	 /** 
	  * @return Um conjunto contendo todos os serviços grade envolvidos 
	  * na tentativa de execução da tarefa do usuário de acordo com o
	  * arquivo de log da execução
	  * @throws FileNotFoundException Se o arquivo de log não puder ser 
	  * acessado. 
	  */
	 public Set<GridService> getServices() throws IOException;
	
}
