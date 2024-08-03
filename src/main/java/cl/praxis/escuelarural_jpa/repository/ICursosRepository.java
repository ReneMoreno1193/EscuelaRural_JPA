package cl.praxis.escuelarural_jpa.repository;

import cl.praxis.escuelarural_jpa.entity.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Cursos, Long> {
}
