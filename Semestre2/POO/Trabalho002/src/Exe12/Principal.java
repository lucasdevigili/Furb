package Exe12;

public class Principal {
  public static void main(String[] args) {
    Musico musico1 = new Musico("Artista 1");
        Musico musico2 = new Musico("Artista 2");

        // Criar CDs
        CD cd1 = new CD("CD 1", false, false);
        CD cd2 = new CD("CD 2", true, false);

        // Associar músicos aos CDs
        cd1.adicionarMusico(musico1);
        cd2.adicionarMusico(musico2);

        // Criar músicas
        Musica musica1 = new Musica("Música 1", 180);
        Musica musica2 = new Musica("Música 2", 240);

        // Associar músicas aos CDs
        cd1.adicionarMusica(musica1);
        cd2.adicionarMusica(musica2);

        // Listar músicos de um CD
        listarMusicosDeCD(cd1);

        // Listar músicas de um CD
        listarMusicasDeCD(cd2);
    }

    public static void listarMusicosDeCD(CD cd) {
        System.out.println("Músicos do CD '" + cd.getTitulo() + "':");
        for (Musico musico : cd.getMusicos()) {
            System.out.println(musico.getNome());
        }
    }

    public static void listarMusicasDeCD(CD cd) {
        System.out.println("Músicas do CD '" + cd.getTitulo() + "':");
        for (Musica musica : cd.getMusicas()) {
            System.out.println(musica.getTitulo() + " (Duração: " + musica.getDuracao() + " segundos)");
        }
    }
}
