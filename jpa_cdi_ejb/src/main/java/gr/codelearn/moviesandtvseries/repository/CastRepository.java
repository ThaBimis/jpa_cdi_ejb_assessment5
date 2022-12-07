package gr.codelearn.moviesandtvseries.repository;

import gr.codelearn.moviesandtvseries.domain.Cast;


public class CastRepository extends AbstractRepository<Cast,Long>{
    @Override
    public Class<Cast> getClassType() {
        return Cast.class;
    }

}
