package guru.springframework.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeerDta {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    public static BeerDtaBuilder builder() {
        return new BeerDtaBuilder();
    }

    public static class BeerDtaBuilder {
        private UUID id;
        private String beerName;
        private String beerStyle;
        private Long upc;

        BeerDtaBuilder() {
        }

        public BeerDtaBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public BeerDtaBuilder beerName(String beerName) {
            this.beerName = beerName;
            return this;
        }

        public BeerDtaBuilder beerStyle(String beerStyle) {
            this.beerStyle = beerStyle;
            return this;
        }

        public BeerDtaBuilder upc(Long upc) {
            this.upc = upc;
            return this;
        }

        public BeerDta build() {
            return new BeerDta(id, beerName, beerStyle, upc);
        }

        public String toString() {
            return "BeerDta.BeerDtaBuilder(id=" + this.id + ", beerName=" + this.beerName + ", beerStyle=" + this.beerStyle + ", upc=" + this.upc + ")";
        }
    }
}
