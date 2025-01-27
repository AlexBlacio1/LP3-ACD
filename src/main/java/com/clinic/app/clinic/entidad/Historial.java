package com.clinic.app.clinic.entidad;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class Historial {

    @Setter
    @Getter
    @Size(min = 10, max = 50, message = "El nombre debe tener entre 10 y 50 caracteres.")
    private String name;

    @Min(value = 0, message = "La edad debe ser mayor o igual a 0.")
    private int edad;

    @NotBlank(message = "El sexo es obligatorio.")
    private String sexo;

    @NotBlank(message = "La cédula es obligatoria.")
    private String cedula;

    @NotNull(message = "La fecha de nacimiento es obligatoria.")
    @Past(message = "La fecha de nacimiento debe ser en el pasado.")
    private Date fechaNacimiento;

    @NotBlank(message = "El estado civil es obligatorio.")
    private String estadoCivil;

    @Email(message = "El correo electrónico debe ser válido.")
    private String email;

    @Pattern(regexp = "\\+?\\d{10,15}", message = "El número de contacto debe tener entre 10 y 15 dígitos.")
    private String numeroContacto;

    @NotBlank(message = "La dirección es obligatoria.")
    private String direccion;

    private String antecedentesFamiliares;

    private String alergias;

    @NotBlank(message = "Los medicamentos actuales son obligatorios.")
    private String medicamentosActuales;

    private String enfermedadesCronicas;

    private String cirugiasPrevias;

    @NotBlank(message = "El motivo de consulta es obligatorio.")
    private String motivoConsulta;


    @Size(max = 500, message = "El diagnóstico debe tener un máximo de 500 caracteres.")
    private String diagnostico;

    @NotBlank(message = "El tratamiento es obligatorio.")
    private String tratamiento;

    @NotNull(message = "La fecha de inicio del tratamiento es obligatoria.")
    @PastOrPresent(message = "La fecha de inicio del tratamiento debe ser hoy o en el pasado.")
    private Date fechaInicioTratamiento;

    @Size(max = 100, message = "La referencia médica debe tener un máximo de 100 caracteres.")
    private String referenciaMedica;

    @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}", message = "La fecha de la última consulta debe ser en formato dd/MM/yyyy.")
    private String ultimaConsulta;

    @Size(max = 1000, message = "Las observaciones deben tener un máximo de 1000 caracteres.")
    private String observaciones;
}
