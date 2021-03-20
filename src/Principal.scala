
class Paciente(nombre:String, primerAp:String,segundoAP:String, edad:Byte,
               val fecha:Array[String], val horaDeRegistro:Array[String],val nivelBienestar:Array[Byte], 
               val temperaturas:Array[Double],val humedad:Array[Double]) {
  
  def llenardatos(n : Int){
    var fechas = new Array[String](n)
    for (i <- 0 until fechas.length) {
      var dia = 0; 
      val año = 1900 + math.random*( 2021 - 1900).toInt;
      val mes = 1 + math.random*( 12 - 1).toInt;
       val j = mes match{
      case 1 => (dia = (1 + math.random*( 31 - 1)).toInt)
      case 2 => 
        val x =0;
        val h = 1900;
        for( h <- 1900 to 2021 by + 4){
        if(h.equals(año)){
          x==1;
          h==2021;
        }
          
          
      }
        if(x==0)(dia = (1 + math.random*( 28 - 1)).toInt)
        else(dia = (1 + math.random*( 29 - 1)).toInt)
      case 3 => (dia = (1 + math.random*( 31 - 1)).toInt)
      case 4 => (dia = (1 + math.random*( 31 - 1)).toInt)
      case 5 => (dia = (1 + math.random*( 31 - 1)).toInt)
      case 6 => (dia = (1 + math.random*( 31 - 1)).toInt)
      case 7 => (dia = (1 + math.random*( 31 - 1)).toInt)
      case 8 => (dia = (1 + math.random*( 31 - 1)).toInt)
      case 9 => (dia = (1 + math.random*( 31 - 1)).toInt)
      case 10 => (dia = (1 + math.random*( 31 - 1)).toInt)
      case 11 => (dia = (1 + math.random*( 31 - 1)).toInt)
      case 12 => (dia = (1 + math.random*( 31 - 1)).toInt)
      
      }
      
      fechas(i) = dia + "/" + mes + "/" + año
    }
    
     var horaRegistro = new Array[String](n)
    for (i <- 0 until horaRegistro.length) {
      val hora =  (0 + math.random*( 23 - 0)).toInt
      val min = (0 + math.random*( 59 - 0)).toInt
      horaRegistro(i) = hora + ":" + min
    }
     
     var nivelBienestar = new Array[Byte](n)
    for (i <- 0 until nivelBienestar.length) {
      nivelBienestar(i) = (1 + math.random*( 5 - 1)).toByte
    }
     
     
    nivelBienestar
    horaRegistro
    
    
    fechas
  }
  
  def nivelPromBien(): Unit ={
    
  }
  
  def tempMayor(): Unit={}
  
  def tempMenor(): Unit={}
  
}

object Principal {
  
  
  
  
  def main(args: Array[String]): Unit = {
    
    
    //val p = new Paciente
    
  }
}