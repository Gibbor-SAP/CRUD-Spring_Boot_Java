package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroPaciente(String nombre, String email, String telefono, String documentoIdentidad, DatosDireccion direccion) {
}
