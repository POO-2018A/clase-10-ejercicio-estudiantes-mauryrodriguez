
import estudiantes.Estudiantes;



public class principal {
        public static void main(String[] args) {
        
        Estudiantes[] estudiantess = new Estudiantes[5];
        // 2 materias
        estudiantess [0] =new Estudiantes("Maury","Rodriguez","1725169864");
        Estudiantes estudiantess1 = new Estudiantes("Maury","Rodriguez","1725169864");
        System.out.println("Estudiante Nº 1");
        System.out.println();
        System.out.println("Nombre: "+estudiantess1.getNombre());
        System.out.println("Apellido: "+estudiantess1.getApellido());
        System.out.println("Cedula: "+estudiantess1.getCedula());
        System.out.println("Materias: ");
        String []m= {"m1","m2"};
        estudiantess[0].setMaterias(m);
        String [] materiasEstudiantes = estudiantess[0].getMaterias();
        for(int i=0; i<materiasEstudiantes.length; i++){
            System.out.println(materiasEstudiantes[i]);
        }
            System.out.println();
        // 3 materias
        estudiantess [1] =new Estudiantes("Naty","Guallochico","1625169864");
        Estudiantes estudiantess2 = new Estudiantes("Naty","Guallochico","1625169864");
        System.out.println("Estudiante Nº 2");
        System.out.println();
        System.out.println("Nombre: "+estudiantess2.getNombre());
        System.out.println("Apellido: "+estudiantess2.getApellido());
        System.out.println("Cedula: "+estudiantess2.getCedula());
        System.out.println("Materias: ");
        String []p= {"m2","m3","m4"};
        estudiantess[1].setMaterias(p);
        String [] materiasEstudiantes2 = estudiantess[1].getMaterias();
        for(int i=0; i<materiasEstudiantes2.length; i++){
            System.out.println(materiasEstudiantes2[i]);
        }
        System.out.println();
        // 4 materias
        estudiantess [2] =new Estudiantes("Andrea","Quishpe","1597169864");
        Estudiantes estudiantess3 = new Estudiantes("Andrea","Quishpe","1597169864");
        System.out.println("Estudiante Nº 3");
        System.out.println();
        System.out.println("Nombre: "+estudiantess3.getNombre());
        System.out.println("Apellido: "+estudiantess3.getApellido());
        System.out.println("Cedula: "+estudiantess3.getCedula());
        System.out.println("Materias: ");
        String []q= {"m2","m3","m4","m5"};
        estudiantess[2].setMaterias(q);
        String [] materiasEstudiantes3 = estudiantess[2].getMaterias();
        for(int i=0; i<materiasEstudiantes3.length; i++){
            System.out.println(materiasEstudiantes3[i]);
        }
        System.out.println();
        // 3 materias
        estudiantess [3] =new Estudiantes("Dany","Pepito","1725169789");
        Estudiantes estudiantess4 = new Estudiantes("Dany","Pepito","1725169789");
        System.out.println("Estudiante Nº 4");
        System.out.println();
        System.out.println("Nombre: "+estudiantess4.getNombre());
        System.out.println("Apellido: "+estudiantess4.getApellido());
        System.out.println("Cedula: "+estudiantess4.getCedula());
        System.out.println("Materias: ");
        String []r= {"m1","m2","m3"};
        estudiantess[3].setMaterias(r);
        String [] materiasEstudiantes4 = estudiantess[1].getMaterias();
        for(int i=0; i<materiasEstudiantes4.length; i++){
            System.out.println(materiasEstudiantes4[i]);
        }
        System.out.println();
        // 2 materias
        estudiantess [4] =new Estudiantes("Mesias","Pumisacho","1722689864");
        Estudiantes estudiantess5 = new Estudiantes("Mesias","Pumisacho","1722689864");
        System.out.println("Estudiante Nº 5");
        System.out.println();
        System.out.println("Nombre: "+estudiantess5.getNombre());
        System.out.println("Apellido: "+estudiantess5.getApellido());
        System.out.println("Cedula: "+estudiantess5.getCedula());
        System.out.println("Materias: ");
        String []s= {"m1","m2"};
        estudiantess[4].setMaterias(s);
        String [] materiasEstudiantes5 = estudiantess[1].getMaterias();
        for(int i=0; i<materiasEstudiantes5.length; i++){
            System.out.println(materiasEstudiantes5[i]);
        }
        

    }
        
}
