package aula09;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[4];
        Livro[] l = new Livro[5];
        
        p[0] = new Pessoa("Ramon", 23, "M");
        p[1] = new Pessoa("Ingridy", 21, "F");
        p[2] = new Pessoa("Rone", 28, "M");
        p[3] = new Pessoa("Amanda", 15, "F");
        
        l[0] = new Livro("Desbloqueie o poder da sua Mente", "Michael Arruda", 192, p[2]);
        l[1] = new Livro("NoSQL Essencial", "Martin Fowler", 216, p[0]);
        l[2] = new Livro("A menina que roubava livros", "Markus Zusak", 480, p[3]);
        l[3] = new Livro("A Cabana", "William P. Young", 240, p[1]);
        l[4] = new Livro("A culpa é das estrelas", "John Green", 288, p[1]);
        
        l[1].abrir();
        l[1].folhear(10);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
        
        System.out.println(l[3].detalhes());

        l[0].abrir();
        l[0].folhear(25);
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
    }
    
}
