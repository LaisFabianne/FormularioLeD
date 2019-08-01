
package br.edu.ifal.novoprojeto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MeuControlador{

  @RequestMapping("/")
  public ModelAndView index(){
      ModelAndView resposta = new ModelAndView("index.html");
      return resposta;
  }

  @RequestMapping("/formulario")
  public ModelAndView cadastro(){
      return new ModelAndView("Formulario.html");
  }

  @RequestMapping(value = "/cadastro_aluno")
  public ModelAndView cadastroAluno(Aluno aluno){
      ModelAndView resposta = new ModelAndView("Formulario.html");
      //...validar o que o usuário e salvar no BD
      resposta.addObject("mensagem", "Cadastro com sucesso!");
      resposta.addObject("mensagem", "Nome: " + aluno.getNome());
      resposta.addObject("mensagem", "Email: " + aluno.getEmail());
      resposta.addObject("mensagem", "CPF: " + aluno.getCpf());
      resposta.addObject("mensagem", "Módulo: " + aluno.getModulo());
      resposta.addObject("mensagem", "Área: " + aluno.getAreas());
      return resposta;
  }
}
