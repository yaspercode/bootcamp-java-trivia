package academy.atl.trivia;

import academy.atl.trivia.model.Categoria;
import academy.atl.trivia.model.Pregunta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {
    @GetMapping("/categories")
    public Categoria[] getCategories() {
        Categoria categoriaCienciaFiccion = new Categoria();
        Categoria categoriaEntretenimiento = new Categoria();
        Categoria categoriaGastronomia = new Categoria();
        Categoria categoriaSalud = new Categoria();
        Categoria categoriaMitologia = new Categoria();
        Categoria categoriaDeporte = new Categoria();
        categoriaCienciaFiccion.setCategory("Ciencia ficción");
        categoriaCienciaFiccion.setDescription("Preguntas relacionadas con cosas futuristas.");
        categoriaEntretenimiento.setCategory("Entretenimiento");
        categoriaEntretenimiento.setDescription("Preguntas relacionadas con programas de televisión, celebridades y videojuegos.");
        categoriaGastronomia.setCategory("Gastronomía");
        categoriaGastronomia.setDescription("Preguntas relacionadas con platos típicos de diferentes pasies, ingredientes y diferentes recetas.");
        categoriaSalud.setCategory("Salud");
        categoriaSalud.setDescription("Preguntas relacionadas sobre nutrición, ejercicio físico y habitos saludables.");
        categoriaMitologia.setCategory("Mitología");
        categoriaMitologia.setDescription("Preguntas relacionadas sobre dioses y diosas, leyendas populares y criaturas míticas.");
        categoriaDeporte.setCategory("Deporte");
        categoriaDeporte.setDescription("Preguntas relacionadas sobre surf, escalada, paracaidismo, motocross y fútbol.");
        Categoria[] categorias = new Categoria[6];
        categorias[0] = categoriaCienciaFiccion;
        categorias[1] = categoriaEntretenimiento;
        categorias[2] = categoriaGastronomia;
        categorias[3] = categoriaSalud;
        categorias[4] = categoriaMitologia;
        categorias[5] = categoriaDeporte;
        return categorias;
    }

    @GetMapping("/question/{category}")
    public Pregunta getQuestion(@PathVariable String category) {
        Pregunta pregunta = new Pregunta();
        if (category.equalsIgnoreCase("Gastronomía")) {
            pregunta.setCategory("Gastronomía");
            pregunta.setQuestion("¿Cual de los siguienetes platos es considerado el plato bandera de Perú?");
            List<String> opcions = new ArrayList<>();
            opcions.add("Ceviche");
            opcions.add("Lomo saltado");
            opcions.add("Rocoto relleno");
            opcions.add("Causa limeña");
            pregunta.setOptions(opcions);
            pregunta.setAnswer(0);
            pregunta.setExplanation("El ceviche es uno de los platos más representativos de la gastronomía peruana. Consiste en pescado o mariscos frescos marinados en jugo de limón, cilantro y otros condimentos.");
        }else if (category.equalsIgnoreCase("Ciencia Ficción")) {
            pregunta.setCategory("Ciencia Ficción");
            pregunta.setQuestion("¿Cuál de las siguientes películas es considerada un clásico de la ciencia ficción?");
            List<String> opcions = new ArrayList<>();
            opcions.add("Jurassic Park");
            opcions.add("Titanic");
            opcions.add("The Godfather");
            opcions.add("Blade Runner");
            pregunta.setOptions(opcions);
            pregunta.setAnswer(3);
            pregunta.setExplanation("Blade Runner es considerada una película clásica de la ciencia ficción. Fue lanzada en 1982 y está ambientada en un futuro distópico donde los humanoides conocidos como replicantes son utilizados en tareas peligrosas. La película es conocida por su estilo visual único y su exploración de temas filosóficos y éticos relacionados con la inteligencia artificial y la identidad humana.");
        }else if (category.equalsIgnoreCase("Entretenimiento")) {
            pregunta.setCategory("Entretenimiento");
            pregunta.setQuestion("¿Cuál de los siguientes programas de televisión es considerado un clásico de la comedia?");
            List<String> opcions = new ArrayList<>();
            opcions.add("Breaking Bad");
            opcions.add("Friends");
            opcions.add("Game of Thrones");
            opcions.add("The Walking Dead");
            pregunta.setOptions(opcions);
            pregunta.setAnswer(1);
            pregunta.setExplanation("Friends es considerado un clásico de la comedia. La serie se emitió desde 1994 hasta 2004 y sigue siendo muy popular hasta el día de hoy. Friends se centra en un grupo de amigos que viven en Nueva York y cuenta con un elenco talentoso, diálogos divertidos y situaciones cómicas que han dejado una marca en la cultura popular.");
        }else if (category.equalsIgnoreCase("Salud")) {
            pregunta.setCategory("Salud");
            pregunta.setQuestion("¿Cuál de los siguientes alimentos es considerado una excelente fuente de proteínas?");
            List<String> opcions = new ArrayList<>();
            opcions.add("Pollo");
            opcions.add("Pasta");
            opcions.add("Galletas");
            opcions.add("Refresco");
            pregunta.setOptions(opcions);
            pregunta.setAnswer(0);
            pregunta.setExplanation("El pollo es considerado una excelente fuente de proteínas. Es una carne magra que contiene todos los aminoácidos esenciales necesarios para la construcción y reparación de tejidos en el cuerpo. Además, el pollo es una fuente de proteínas de alta calidad con un bajo contenido de grasas saturadas, lo que lo convierte en una opción saludable para incluir en una dieta equilibrada.");
        }else if(category.equalsIgnoreCase("Mitología")) {
            pregunta.setCategory("Mitología");
            pregunta.setQuestion("¿Cuál de los siguientes dioses es considerado el rey de los dioses en la mitología griega?");
            List<String> opcions = new ArrayList<>();
            opcions.add("Poseidón");
            opcions.add("Apolo");
            opcions.add("Hades");
            opcions.add("Zeus");
            pregunta.setOptions(opcions);
            pregunta.setAnswer(3);
            pregunta.setExplanation("Zeus es considerado el rey de los dioses en la mitología griega. Es el dios del cielo y el trueno, y gobierna desde el Monte Olimpo. Zeus es conocido por su poderío y liderazgo, y es considerado el dios principal en el panteón griego. Se le atribuyen muchas historias y leyendas, y su figura es fundamental en la mitología griega.");
        }
        else if (category.equalsIgnoreCase("Deporte")) {
            pregunta.setCategory("Deporte");
            pregunta.setQuestion("¿Cuál de los siguientes surfistas profesionales es conocido por haber realizado el primer tubo en la legendaria ola de Pipeline en Hawái?");
            List<String> opcions = new ArrayList<>();
            opcions.add("Kelly Slater");
            opcions.add("Laird Hamilton");
            opcions.add("Andy Irons");
            opcions.add("Mick Fanning");
            pregunta.setOptions(opcions);
            pregunta.setAnswer(1);
            pregunta.setExplanation("Laird Hamilton es conocido por haber realizado el primer tubo en la legendaria ola de Pipeline en Hawái. Hamilton es considerado uno de los pioneros del surf de olas grandes y ha sido reconocido por su valentía y habilidad en condiciones extremas. Su contribución al mundo del surf y su impacto en la cultura del surf lo han convertido en una leyenda en el deporte.");
        }

        return pregunta;
    }
}
