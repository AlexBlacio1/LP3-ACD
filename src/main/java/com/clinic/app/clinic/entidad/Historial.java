package com.clinic.app.clinic.entidad;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


public class Historial {


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    public void setAntecedentesFamiliares(String antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicamentosActuales() {
        return medicamentosActuales;
    }

    public void setMedicamentosActuales(String medicamentosActuales) {
        this.medicamentosActuales = medicamentosActuales;
    }

    public String getEnfermedadesCronicas() {
        return enfermedadesCronicas;
    }

    public void setEnfermedadesCronicas(String enfermedadesCronicas) {
        this.enfermedadesCronicas = enfermedadesCronicas;
    }

    public String getCirugiasPrevias() {
        return cirugiasPrevias;
    }

    public void setCirugiasPrevias(String cirugiasPrevias) {
        this.cirugiasPrevias = cirugiasPrevias;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Date getFechaInicioTratamiento() {
        return fechaInicioTratamiento;
    }

    public void setFechaInicioTratamiento(Date fechaInicioTratamiento) {
        this.fechaInicioTratamiento = fechaInicioTratamiento;
    }

    public String getReferenciaMedica() {
        return referenciaMedica;
    }

    public void setReferenciaMedica(String referenciaMedica) {
        this.referenciaMedica = referenciaMedica;
    }

    public String getUltimaConsulta() {
        return ultimaConsulta;
    }

    public void setUltimaConsulta(String ultimaConsulta) {
        this.ultimaConsulta = ultimaConsulta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
