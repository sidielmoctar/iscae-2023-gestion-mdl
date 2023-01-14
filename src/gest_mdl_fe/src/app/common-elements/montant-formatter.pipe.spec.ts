import { MontantFormatterPipe } from './montant-formatter.pipe';

describe('MontantFormatterPipe', () => {
  it('create an instance', () => {
    const pipe = new MontantFormatterPipe();
    expect(pipe).toBeTruthy();
  });
});
